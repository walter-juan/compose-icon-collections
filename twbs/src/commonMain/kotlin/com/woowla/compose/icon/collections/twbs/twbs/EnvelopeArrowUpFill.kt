package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.EnvelopeArrowUpFill: ImageVector
    get() {
        if (_envelopeArrowUpFill != null) {
            return _envelopeArrowUpFill!!
        }
        _envelopeArrowUpFill = Builder(name = "EnvelopeArrowUpFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.05f, 3.555f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.95f, 1.555f)
                lineTo(8.0f, 8.414f)
                close()
                moveTo(0.0f, 4.697f)
                verticalLineToRelative(7.104f)
                lineToRelative(5.803f, -3.558f)
                close()
                moveTo(0.192f, 12.856f)
                lineTo(6.762f, 8.829f)
                lineTo(8.0f, 9.586f)
                lineToRelative(1.239f, -0.757f)
                lineToRelative(0.367f, 0.225f)
                arcTo(4.49f, 4.49f, 0.0f, false, false, 8.0f, 12.5f)
                curveToRelative(0.0f, 0.526f, 0.09f, 1.03f, 0.256f, 1.5f)
                lineTo(2.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.808f, -1.144f)
                moveTo(16.0f, 4.697f)
                verticalLineToRelative(4.974f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 12.5f, 8.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -1.965f, 0.45f)
                lineToRelative(-0.338f, -0.207f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 16.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, -7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 7.0f)
                moveToRelative(0.354f, -5.354f)
                lineToRelative(1.25f, 1.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.708f)
                lineTo(13.0f, 12.207f)
                verticalLineTo(14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-1.717f)
                lineToRelative(-0.28f, 0.305f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.737f, -0.676f)
                lineToRelative(1.149f, -1.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.722f, -0.016f)
            }
        }
        .build()
        return _envelopeArrowUpFill!!
    }

private var _envelopeArrowUpFill: ImageVector? = null
