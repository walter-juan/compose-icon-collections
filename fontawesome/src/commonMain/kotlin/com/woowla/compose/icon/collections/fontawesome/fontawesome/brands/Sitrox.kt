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

public val BrandsGroup.Sitrox: ImageVector
    get() {
        if (_sitrox != null) {
            return _sitrox!!
        }
        _sitrox = Builder(name = "Sitrox", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.44f, 0.01f)
                verticalLineTo(0.0f)
                horizontalLineTo(448.0f)
                verticalLineTo(128.0f)
                horizontalLineTo(64.0f)
                curveTo(64.0f, 57.6f, 141.76f, 0.48f, 212.44f, 0.01f)
                close()
                moveTo(237.26f, 192.0f)
                verticalLineTo(192.01f)
                curveTo(307.14f, 192.48f, 384.0f, 249.6f, 384.0f, 320.0f)
                horizontalLineTo(210.81f)
                verticalLineTo(319.99f)
                curveTo(140.91f, 319.56f, 64.0f, 262.42f, 64.0f, 192.0f)
                horizontalLineTo(237.26f)
                close()
                moveTo(235.57f, 511.99f)
                curveTo(306.25f, 511.52f, 384.0f, 454.4f, 384.0f, 384.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(512.0f)
                horizontalLineTo(235.57f)
                verticalLineTo(511.99f)
                close()
            }
        }
        .build()
        return _sitrox!!
    }

private var _sitrox: ImageVector? = null
