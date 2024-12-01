package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Honeybadger: ImageVector
    get() {
        if (_honeybadger != null) {
            return _honeybadger!!
        }
        _honeybadger = Builder(name = "Honeybadger", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.999f, 0.0f)
                curveToRelative(-0.346f, 0.0f, -0.691f, 0.131f, -0.955f, 0.395f)
                lineTo(0.394f, 11.045f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, false, 0.0f, 1.91f)
                lineToRelative(6.243f, 6.24f)
                lineToRelative(0.915f, -1.95f)
                lineTo(2.306f, 12.0f)
                lineToRelative(9.693f, -9.693f)
                lineToRelative(1.158f, 1.157f)
                lineToRelative(1.432f, -1.432f)
                lineTo(12.954f, 0.395f)
                arcTo(1.346f, 1.346f, 0.0f, false, false, 11.999f, 0.0f)
                close()
                moveTo(17.539f, 1.106f)
                arcToRelative(0.331f, 0.331f, 0.0f, false, false, -0.218f, 0.102f)
                lineToRelative(-1.777f, 1.778f)
                lineToRelative(-1.432f, 1.432f)
                lineToRelative(-8.393f, 8.392f)
                horizontalLineToRelative(4.726f)
                lineToRelative(-3.76f, 9.26f)
                curveToRelative(-0.139f, 0.34f, 0.29f, 0.626f, 0.55f, 0.366f)
                lineToRelative(1.321f, -1.32f)
                verticalLineToRelative(-0.001f)
                lineToRelative(1.432f, -1.432f)
                horizontalLineToRelative(0.001f)
                lineToRelative(8.56f, -8.561f)
                horizontalLineToRelative(-4.727f)
                lineToRelative(2.083f, -4.91f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.854f, -2.012f)
                lineToRelative(1.112f, -2.623f)
                curveToRelative(0.108f, -0.256f, -0.108f, -0.485f, -0.333f, -0.472f)
                close()
                moveTo(17.789f, 5.231f)
                lineTo(16.936f, 7.243f)
                lineTo(21.692f, 11.999f)
                lineTo(12.0f, 21.693f)
                lineToRelative(-1.056f, -1.055f)
                lineToRelative(-1.432f, 1.432f)
                lineToRelative(1.533f, 1.534f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, false, 1.91f, 0.0f)
                lineToRelative(10.65f, -10.65f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, false, 0.0f, -1.91f)
                close()
            }
        }
        .build()
        return _honeybadger!!
    }

private var _honeybadger: ImageVector? = null
