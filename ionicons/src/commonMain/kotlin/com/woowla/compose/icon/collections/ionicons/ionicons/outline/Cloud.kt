package com.woowla.compose.icon.collections.ionicons.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.OutlineGroup

public val OutlineGroup.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(400.0f, 240.0f)
                curveToRelative(-8.89f, -89.54f, -71.0f, -144.0f, -144.0f, -144.0f)
                curveToRelative(-69.0f, 0.0f, -113.44f, 48.2f, -128.0f, 96.0f)
                curveTo(68.0f, 198.0f, 16.0f, 235.59f, 16.0f, 304.0f)
                curveToRelative(0.0f, 66.0f, 54.0f, 112.0f, 120.0f, 112.0f)
                horizontalLineTo(396.0f)
                curveToRelative(55.0f, 0.0f, 100.0f, -27.44f, 100.0f, -88.0f)
                curveTo(496.0f, 268.18f, 443.0f, 242.24f, 400.0f, 240.0f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null