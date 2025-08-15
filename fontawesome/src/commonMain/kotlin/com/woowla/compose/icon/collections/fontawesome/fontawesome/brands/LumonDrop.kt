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

public val BrandsGroup.LumonDrop: ImageVector
    get() {
        if (_lumonDrop != null) {
            return _lumonDrop!!
        }
        _lumonDrop = Builder(name = "LumonDrop", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 32.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                lineToRelative(0.0f, 224.0f)
                curveToRelative(0.0f, 53.0f, -43.0f, 96.0f, -96.0f, 96.0f)
                lineTo(96.0f, 448.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                lineTo(0.0f, 128.0f)
                curveTo(0.0f, 75.0f, 43.0f, 32.0f, 96.0f, 32.0f)
                lineToRelative(384.0f, 0.0f)
                close()
                moveTo(302.4f, 114.7f)
                curveToRelative(-9.8f, -16.4f, -20.5f, -16.4f, -29.6f, 0.0f)
                lineToRelative(-68.9f, 114.0f)
                curveToRelative(-10.7f, 15.6f, -16.4f, 32.8f, -16.4f, 52.5f)
                curveToRelative(0.0f, 50.9f, 44.3f, 94.3f, 100.1f, 94.3f)
                curveToRelative(55.0f, 0.0f, 100.9f, -43.5f, 100.9f, -94.3f)
                curveToRelative(0.0f, -19.7f, -6.6f, -37.8f, -17.2f, -52.5f)
                lineToRelative(-68.9f, -114.0f)
                close()
            }
        }
        .build()
        return _lumonDrop!!
    }

private var _lumonDrop: ImageVector? = null
