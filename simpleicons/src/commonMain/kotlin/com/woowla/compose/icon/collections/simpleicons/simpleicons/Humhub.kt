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

public val Simpleicons.Humhub: ImageVector
    get() {
        if (_humhub != null) {
            return _humhub!!
        }
        _humhub = Builder(name = "Humhub", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.709f, 7.781f)
                curveToRelative(0.101f, -1.678f, -0.888f, -3.23f, -2.451f, -3.845f)
                lineTo(11.945f, 0.269f)
                curveToRelative(-1.566f, -0.616f, -3.349f, -0.152f, -4.418f, 1.146f)
                lineToRelative(-6.36f, 7.731f)
                curveTo(0.099f, 10.444f, -0.01f, 12.291f, 0.893f, 13.709f)
                lineToRelative(5.387f, 8.463f)
                curveToRelative(0.904f, 1.418f, 2.627f, 2.129f, 4.256f, 1.708f)
                lineToRelative(9.685f, -2.51f)
                curveToRelative(1.627f, -0.421f, 2.789f, -1.88f, 2.89f, -3.559f)
                lineToRelative(0.088f, -2.192f)
                reflectiveCurveToRelative(0.166f, -1.304f, -1.369f, -1.326f)
                curveToRelative(-1.131f, -0.015f, -0.987f, 0.962f, -1.975f, 1.568f)
                curveToRelative(-0.793f, 0.486f, -3.358f, 0.726f, -4.024f, -1.93f)
                curveToRelative(0.0f, 0.0f, -0.778f, -2.333f, 0.704f, -4.494f)
                curveToRelative(1.481f, -2.161f, 3.168f, -1.012f, 3.826f, -0.097f)
                curveToRelative(1.31f, 1.824f, 3.252f, 0.987f, 3.239f, -0.383f)
                close()
            }
        }
        .build()
        return _humhub!!
    }

private var _humhub: ImageVector? = null
