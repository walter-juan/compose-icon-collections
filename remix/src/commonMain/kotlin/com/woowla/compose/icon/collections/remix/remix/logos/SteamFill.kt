package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.SteamFill: ImageVector
    get() {
        if (_steamFill != null) {
            return _steamFill!!
        }
        _steamFill = Builder(name = "SteamFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.005f, 2.0f)
                curveTo(6.754f, 2.0f, 2.449f, 6.05f, 2.041f, 11.198f)
                lineTo(7.401f, 13.413f)
                curveTo(7.855f, 13.103f, 8.404f, 12.921f, 8.994f, 12.921f)
                curveTo(9.047f, 12.921f, 9.099f, 12.924f, 9.151f, 12.926f)
                lineTo(11.535f, 9.474f)
                verticalLineTo(9.425f)
                curveTo(11.535f, 7.346f, 13.225f, 5.655f, 15.305f, 5.655f)
                curveTo(17.383f, 5.655f, 19.075f, 7.347f, 19.075f, 9.427f)
                curveTo(19.075f, 11.507f, 17.383f, 13.198f, 15.305f, 13.198f)
                horizontalLineTo(15.218f)
                lineTo(11.821f, 15.624f)
                curveTo(11.821f, 15.667f, 11.824f, 15.712f, 11.824f, 15.757f)
                curveTo(11.824f, 17.319f, 10.562f, 18.587f, 8.999f, 18.587f)
                curveTo(7.637f, 18.587f, 6.486f, 17.609f, 6.224f, 16.314f)
                lineTo(2.386f, 14.725f)
                curveTo(3.574f, 18.923f, 7.428f, 22.0f, 12.005f, 22.0f)
                curveTo(17.528f, 22.0f, 22.004f, 17.522f, 22.004f, 12.0f)
                curveTo(22.004f, 6.477f, 17.527f, 2.0f, 12.005f, 2.0f)
                close()
                moveTo(7.079f, 16.667f)
                curveTo(7.297f, 17.119f, 7.674f, 17.499f, 8.174f, 17.708f)
                curveTo(9.254f, 18.157f, 10.501f, 17.645f, 10.95f, 16.563f)
                curveTo(11.169f, 16.038f, 11.17f, 15.463f, 10.954f, 14.938f)
                curveTo(10.738f, 14.413f, 10.329f, 14.004f, 9.807f, 13.786f)
                curveTo(9.287f, 13.569f, 8.732f, 13.578f, 8.242f, 13.761f)
                lineTo(9.511f, 14.286f)
                curveTo(10.308f, 14.619f, 10.685f, 15.536f, 10.352f, 16.332f)
                curveTo(10.021f, 17.129f, 9.104f, 17.507f, 8.307f, 17.175f)
                lineTo(7.079f, 16.667f)
                close()
                moveTo(17.819f, 9.422f)
                curveTo(17.819f, 8.038f, 16.691f, 6.91f, 15.306f, 6.91f)
                curveTo(13.918f, 6.91f, 12.793f, 8.038f, 12.793f, 9.422f)
                curveTo(12.793f, 10.81f, 13.918f, 11.935f, 15.306f, 11.935f)
                curveTo(16.692f, 11.935f, 17.819f, 10.81f, 17.819f, 9.422f)
                close()
                moveTo(15.312f, 7.53f)
                curveTo(16.353f, 7.53f, 17.2f, 8.375f, 17.2f, 9.418f)
                curveTo(17.2f, 10.461f, 16.353f, 11.306f, 15.312f, 11.306f)
                curveTo(14.268f, 11.306f, 13.424f, 10.461f, 13.424f, 9.418f)
                curveTo(13.424f, 8.375f, 14.269f, 7.53f, 15.312f, 7.53f)
                close()
            }
        }
        .build()
        return _steamFill!!
    }

private var _steamFill: ImageVector? = null
