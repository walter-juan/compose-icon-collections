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

public val Twbs.EnvelopeCheckFill: ImageVector
    get() {
        if (_envelopeCheckFill != null) {
            return _envelopeCheckFill!!
        }
        _envelopeCheckFill = Builder(name = "EnvelopeCheckFill", defaultWidth = 16.0.dp,
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
                moveTo(6.761f, 8.83f)
                lineToRelative(-6.57f, 4.026f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 14.0f)
                horizontalLineToRelative(6.256f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 8.0f, 12.5f)
                arcToRelative(4.49f, 4.49f, 0.0f, false, true, 1.606f, -3.446f)
                lineToRelative(-0.367f, -0.225f)
                lineTo(8.0f, 9.586f)
                close()
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
                moveTo(16.0f, 12.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 7.0f, 0.0f)
                moveToRelative(-1.993f, -1.679f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.686f, 0.172f)
                lineToRelative(-1.17f, 1.95f)
                lineToRelative(-0.547f, -0.547f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, 0.708f)
                lineToRelative(0.774f, 0.773f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.174f, -0.144f)
                lineToRelative(1.335f, -2.226f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.172f, -0.686f)
            }
        }
        .build()
        return _envelopeCheckFill!!
    }

private var _envelopeCheckFill: ImageVector? = null