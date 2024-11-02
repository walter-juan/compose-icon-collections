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

public val BrandsGroup.Wirsindhandwerk: ImageVector
    get() {
        if (_wirsindhandwerk != null) {
            return _wirsindhandwerk!!
        }
        _wirsindhandwerk = Builder(name = "Wirsindhandwerk", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(50.77f, 479.81f)
                horizontalLineToRelative(83.36f)
                lineTo(134.13f, 367.85f)
                lineToRelative(-83.36f, 47.01f)
                close()
                moveTo(379.82f, 479.81f)
                horizontalLineToRelative(82.35f)
                lineTo(462.17f, 414.86f)
                lineToRelative(-82.35f, -47.01f)
                close()
                moveTo(379.82f, 31.81f)
                lineTo(379.82f, 251.57f)
                lineTo(256.18f, 179.19f)
                lineTo(134.5f, 251.57f)
                lineTo(134.5f, 31.81f)
                lineTo(50.77f, 31.81f)
                lineTo(50.77f, 392.61f)
                lineTo(256.18f, 270.32f)
                lineTo(462.17f, 392.61f)
                lineTo(462.17f, 31.81f)
                close()
            }
        }
        .build()
        return _wirsindhandwerk!!
    }

private var _wirsindhandwerk: ImageVector? = null
