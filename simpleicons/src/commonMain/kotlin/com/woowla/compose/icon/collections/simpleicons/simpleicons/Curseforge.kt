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

public val Simpleicons.Curseforge: ImageVector
    get() {
        if (_curseforge != null) {
            return _curseforge!!
        }
        _curseforge = Builder(name = "Curseforge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.326f, 9.215f)
                reflectiveCurveTo(23.226f, 8.442f, 24.0f, 6.188f)
                horizontalLineToRelative(-7.507f)
                verticalLineTo(4.4f)
                horizontalLineTo(0.0f)
                lineToRelative(2.032f, 2.358f)
                verticalLineTo(9.173f)
                reflectiveCurveToRelative(5.127f, -0.266f, 7.11f, 1.237f)
                curveToRelative(2.715f, 2.516f, -3.053f, 5.917f, -3.053f, 5.917f)
                lineTo(5.1f, 19.6f)
                curveToRelative(1.546f, -1.473f, 4.494f, -3.378f, 9.898f, -3.286f)
                curveToRelative(-2.056f, 0.65f, -4.124f, 1.665f, -5.734f, 3.286f)
                horizontalLineToRelative(10.925f)
                lineToRelative(-1.029f, -3.273f)
                reflectiveCurveToRelative(-7.918f, -4.669f, -0.834f, -7.113f)
                close()
            }
        }
        .build()
        return _curseforge!!
    }

private var _curseforge: ImageVector? = null
