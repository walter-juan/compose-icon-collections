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

public val BrandsGroup.Simplybuilt: ImageVector
    get() {
        if (_simplybuilt != null) {
            return _simplybuilt!!
        }
        _simplybuilt = Builder(name = "Simplybuilt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(481.6f, 64.0f)
                lineToRelative(-106.0f, 0.0f)
                curveTo(361.1f, 64.0f, 349.0f, 75.8f, 349.0f, 90.3f)
                lineToRelative(0.0f, 39.6f)
                lineToRelative(-185.3f, 0.0f)
                lineToRelative(0.0f, -39.6f)
                curveToRelative(0.0f, -14.5f, -12.0f, -26.3f, -26.6f, -26.3f)
                lineToRelative(-106.0f, 0.0f)
                curveTo(16.5f, 64.0f, 4.7f, 75.8f, 4.7f, 90.3f)
                lineToRelative(0.0f, 331.4f)
                curveToRelative(0.0f, 14.5f, 11.8f, 26.3f, 26.6f, 26.3f)
                lineToRelative(450.4f, 0.0f)
                curveToRelative(14.8f, 0.0f, 26.6f, -11.8f, 26.6f, -26.3f)
                lineToRelative(0.0f, -331.4f)
                curveToRelative(-0.2f, -14.5f, -12.0f, -26.3f, -26.7f, -26.3f)
                close()
                moveTo(150.5f, 222.7f)
                arcToRelative(66.5f, 66.5f, 0.0f, true, true, -0.3f, 133.1f)
                arcToRelative(66.5f, 66.5f, 0.0f, true, true, 0.3f, -133.1f)
                close()
                moveTo(362.4f, 222.8f)
                arcToRelative(66.5f, 66.5f, 0.0f, true, true, 0.3f, 132.9f)
                arcToRelative(66.5f, 66.5f, 0.0f, true, true, -0.3f, -132.9f)
                close()
            }
        }
        .build()
        return _simplybuilt!!
    }

private var _simplybuilt: ImageVector? = null
