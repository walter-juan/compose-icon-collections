package com.woowla.compose.icon.collections.devicons.devicons.magento

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.MagentoGroup

public val MagentoGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFf26322)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(119.82f, 31.97f)
                verticalLineToRelative(64.01f)
                lineToRelative(-15.85f, 9.12f)
                verticalLineTo(41.17f)
                lineToRelative(-39.62f, -22.9f)
                lineToRelative(-39.64f, 22.9f)
                lineToRelative(0.1f, 63.96f)
                lineToRelative(-15.82f, -9.15f)
                verticalLineTo(32.02f)
                lineTo(64.45f, 0.0f)
                lineToRelative(55.37f, 31.97f)
                close()
                moveTo(72.3f, 105.1f)
                lineToRelative(-7.9f, 4.6f)
                lineToRelative(-7.95f, -4.55f)
                verticalLineTo(41.17f)
                lineToRelative(-15.82f, 9.15f)
                lineToRelative(0.03f, 63.96f)
                lineTo(64.38f, 128.0f)
                lineToRelative(23.77f, -13.72f)
                verticalLineTo(50.29f)
                lineTo(72.3f, 41.14f)
                verticalLineToRelative(63.96f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
