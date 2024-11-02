package com.woowla.compose.icon.collections.ionicons.ionicons.filled

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
import com.woowla.compose.icon.collections.ionicons.ionicons.FilledGroup

public val FilledGroup.Server: ImageVector
    get() {
        if (_server != null) {
            return _server!!
        }
        _server = Builder(name = "Server", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(125.29f, 40.73f)
                curveTo(159.8f, 25.16f, 206.27f, 16.0f, 256.5f, 16.0f)
                curveTo(306.73f, 16.0f, 352.97f, 25.16f, 387.25f, 40.75f)
                curveTo(420.14f, 55.71f, 448.0f, 80.0f, 448.0f, 112.0f)
                verticalLineTo(112.03f)
                curveTo(447.99f, 117.56f, 444.9f, 125.92f, 435.7f, 136.25f)
                curveTo(426.71f, 146.35f, 413.09f, 156.91f, 395.43f, 166.51f)
                curveTo(360.16f, 185.7f, 310.79f, 200.0f, 256.0f, 200.0f)
                curveTo(201.21f, 200.0f, 151.84f, 185.7f, 116.57f, 166.51f)
                curveTo(98.91f, 156.91f, 85.29f, 146.35f, 76.3f, 136.25f)
                curveTo(67.08f, 125.9f, 64.0f, 117.53f, 64.0f, 112.0f)
                curveTo(64.0f, 79.57f, 92.25f, 55.64f, 125.29f, 40.73f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(410.72f, 194.62f)
                curveTo(420.31f, 189.41f, 429.17f, 182.87f, 437.13f, 175.72f)
                curveTo(441.18f, 172.08f, 448.0f, 174.83f, 448.0f, 180.28f)
                verticalLineTo(258.0f)
                curveTo(448.0f, 263.53f, 444.92f, 269.9f, 435.7f, 280.25f)
                curveTo(426.71f, 290.35f, 413.09f, 300.91f, 395.43f, 310.51f)
                curveTo(360.16f, 329.7f, 310.79f, 344.0f, 256.0f, 344.0f)
                curveTo(201.21f, 344.0f, 151.84f, 329.7f, 116.57f, 310.51f)
                curveTo(98.91f, 300.91f, 85.29f, 290.35f, 76.3f, 280.25f)
                curveTo(67.08f, 269.9f, 64.0f, 263.53f, 64.0f, 258.0f)
                verticalLineTo(180.28f)
                curveTo(64.0f, 174.83f, 70.82f, 172.08f, 74.87f, 175.72f)
                curveTo(82.83f, 182.87f, 91.69f, 189.41f, 101.28f, 194.62f)
                curveTo(141.29f, 216.39f, 195.92f, 232.0f, 256.0f, 232.0f)
                curveTo(316.08f, 232.0f, 370.71f, 216.39f, 410.72f, 194.62f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(74.87f, 319.72f)
                curveTo(70.82f, 316.08f, 64.0f, 318.83f, 64.0f, 324.28f)
                verticalLineTo(400.0f)
                curveTo(64.0f, 432.22f, 92.0f, 456.17f, 124.93f, 471.13f)
                curveTo(159.3f, 486.76f, 205.65f, 496.0f, 256.0f, 496.0f)
                curveTo(306.35f, 496.0f, 352.7f, 486.76f, 387.07f, 471.13f)
                curveTo(420.0f, 456.17f, 448.0f, 432.22f, 448.0f, 400.0f)
                verticalLineTo(324.28f)
                curveTo(448.0f, 318.83f, 441.18f, 316.08f, 437.13f, 319.72f)
                curveTo(429.17f, 326.87f, 420.31f, 333.41f, 410.72f, 338.62f)
                curveTo(370.71f, 360.39f, 316.08f, 376.0f, 256.0f, 376.0f)
                curveTo(195.92f, 376.0f, 141.29f, 360.39f, 101.28f, 338.62f)
                curveTo(91.69f, 333.41f, 82.83f, 326.87f, 74.87f, 319.72f)
                close()
            }
        }
        .build()
        return _server!!
    }

private var _server: ImageVector? = null
