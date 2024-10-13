package com.woowla.compose.icon.collections.devicons.devicons.sonarqube

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.SonarqubeGroup

public val SonarqubeGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF549dd0)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(83.22f, 2.03f)
                lineTo(80.25f, 6.92f)
                lineToRelative(0.42f, 0.26f)
                curveToRelative(18.28f, 11.11f, 33.17f, 27.73f, 41.9f, 46.77f)
                lineToRelative(0.2f, 0.45f)
                lineToRelative(0.45f, -0.21f)
                lineToRelative(4.77f, -2.19f)
                lineToRelative(-0.21f, -0.45f)
                curveToRelative(-9.22f, -20.07f, -24.89f, -37.56f, -44.15f, -49.27f)
                close()
                moveTo(83.55f, 3.41f)
                curveToRelative(18.75f, 11.51f, 34.03f, 28.57f, 43.12f, 48.11f)
                lineToRelative(-3.41f, 1.57f)
                curveToRelative(-8.78f, -18.89f, -23.53f, -35.36f, -41.65f, -46.49f)
                close()
                moveTo(44.92f, 4.87f)
                lineToRelative(-1.91f, 6.64f)
                lineToRelative(0.48f, 0.14f)
                curveToRelative(36.22f, 10.4f, 65.13f, 40.21f, 73.61f, 75.85f)
                lineToRelative(0.12f, 0.48f)
                lineToRelative(0.48f, -0.12f)
                lineToRelative(6.23f, -1.48f)
                lineToRelative(-0.12f, -0.48f)
                curveTo(114.77f, 47.82f, 83.98f, 16.09f, 45.39f, 5.01f)
                close()
                moveTo(45.59f, 6.11f)
                curveToRelative(37.85f, 11.06f, 68.06f, 42.21f, 77.12f, 79.53f)
                lineToRelative(-4.8f, 1.14f)
                curveToRelative(-8.67f, -35.64f, -37.5f, -65.36f, -73.68f, -75.93f)
                close()
                moveTo(0.0f, 14.28f)
                verticalLineToRelative(8.09f)
                horizontalLineToRelative(0.5f)
                curveToRelative(57.67f, 0.0f, 104.58f, 46.25f, 104.58f, 103.11f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(8.09f)
                verticalLineToRelative(-0.5f)
                curveTo(113.16f, 64.16f, 62.62f, 14.28f, 0.5f, 14.28f)
                close()
                moveTo(0.99f, 15.3f)
                curveToRelative(61.19f, 0.27f, 110.88f, 49.31f, 111.16f, 109.68f)
                horizontalLineToRelative(-6.11f)
                curveTo(105.77f, 67.97f, 58.79f, 21.67f, 0.99f, 21.4f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
