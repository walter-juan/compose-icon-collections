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

public val Twbs.EnvelopeSlashFill: ImageVector
    get() {
        if (_envelopeSlashFill != null) {
            return _envelopeSlashFill!!
        }
        _envelopeSlashFill = Builder(name = "EnvelopeSlashFill", defaultWidth = 16.0.dp,
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
                moveTo(14.975f, 10.025f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -4.95f, 4.95f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.95f, -4.95f)
                moveToRelative(-4.243f, 0.707f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 3.147f, -0.318f)
                lineToRelative(-3.465f, 3.465f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.318f, -3.147f)
                moveToRelative(0.39f, 3.854f)
                lineToRelative(3.464f, -3.465f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, true, -3.465f, 3.465f)
                close()
            }
        }
        .build()
        return _envelopeSlashFill!!
    }

private var _envelopeSlashFill: ImageVector? = null
