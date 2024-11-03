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

public val Twbs.EnvelopeArrowUp: ImageVector
    get() {
        if (_envelopeArrowUp != null) {
            return _envelopeArrowUp!!
        }
        _envelopeArrowUp = Builder(name = "EnvelopeArrowUp", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(15.0f, 5.383f)
                lineToRelative(-7.0f, 4.2f)
                lineToRelative(-1.326f, -0.795f)
                lineToRelative(-5.64f, 3.47f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 13.0f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(2.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -1.99f)
                close()
                moveTo(1.0f, 11.105f)
                lineTo(5.708f, 8.208f)
                lineTo(1.0f, 5.383f)
                close()
                moveTo(1.0f, 4.0f)
                verticalLineToRelative(0.217f)
                lineToRelative(7.0f, 4.2f)
                lineToRelative(7.0f, -4.2f)
                lineTo(15.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(2.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
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
        return _envelopeArrowUp!!
    }

private var _envelopeArrowUp: ImageVector? = null
