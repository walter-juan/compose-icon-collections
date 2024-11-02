package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Number42Group: ImageVector
    get() {
        if (_number42Group != null) {
            return _number42Group!!
        }
        _number42Group = Builder(name = "Number42Group", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 96.0f)
                verticalLineTo(416.0f)
                curveTo(341.01f, 416.0f, 361.82f, 411.86f, 381.23f, 403.82f)
                curveTo(400.64f, 395.78f, 418.28f, 383.99f, 433.14f, 369.14f)
                curveTo(447.99f, 354.28f, 459.78f, 336.64f, 467.82f, 317.23f)
                curveTo(475.86f, 297.82f, 480.0f, 277.01f, 480.0f, 256.0f)
                curveTo(480.0f, 234.99f, 475.86f, 214.18f, 467.82f, 194.77f)
                curveTo(459.78f, 175.36f, 447.99f, 157.72f, 433.14f, 142.86f)
                curveTo(418.28f, 128.01f, 400.64f, 116.22f, 381.23f, 108.18f)
                curveTo(361.82f, 100.14f, 341.01f, 96.0f, 320.0f, 96.0f)
                close()
                moveTo(0.0f, 256.0f)
                lineTo(160.0f, 416.0f)
                lineTo(320.0f, 256.0f)
                lineTo(160.0f, 96.0f)
                lineTo(0.0f, 256.0f)
                close()
                moveTo(480.0f, 256.0f)
                curveTo(480.0f, 277.01f, 484.14f, 297.82f, 492.18f, 317.23f)
                curveTo(500.22f, 336.64f, 512.01f, 354.28f, 526.86f, 369.14f)
                curveTo(541.72f, 383.99f, 559.36f, 395.78f, 578.77f, 403.82f)
                curveTo(598.18f, 411.86f, 618.99f, 416.0f, 640.0f, 416.0f)
                verticalLineTo(96.0f)
                curveTo(597.57f, 96.0f, 556.87f, 112.86f, 526.86f, 142.86f)
                curveTo(496.86f, 172.87f, 480.0f, 213.57f, 480.0f, 256.0f)
                close()
            }
        }
        .build()
        return _number42Group!!
    }

private var _number42Group: ImageVector? = null
