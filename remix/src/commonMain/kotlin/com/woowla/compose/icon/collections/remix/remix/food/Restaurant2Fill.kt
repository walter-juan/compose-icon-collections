package com.woowla.compose.icon.collections.remix.remix.food

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FoodGroup

public val FoodGroup.Restaurant2Fill: ImageVector
    get() {
        if (_restaurant2Fill != null) {
            return _restaurant2Fill!!
        }
        _restaurant2Fill = Builder(name = "Restaurant2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.222f, 3.808f)
                lineTo(10.94f, 10.525f)
                lineTo(8.111f, 13.354f)
                lineTo(4.222f, 9.464f)
                curveTo(2.66f, 7.902f, 2.66f, 5.37f, 4.222f, 3.808f)
                close()
                moveTo(14.268f, 12.146f)
                lineTo(13.415f, 13.0f)
                lineTo(20.486f, 20.071f)
                lineTo(19.072f, 21.485f)
                lineTo(12.0f, 14.414f)
                lineTo(4.929f, 21.485f)
                lineTo(3.515f, 20.071f)
                lineTo(12.854f, 10.732f)
                curveTo(12.266f, 9.275f, 12.874f, 7.177f, 14.475f, 5.575f)
                curveTo(16.428f, 3.623f, 19.119f, 3.148f, 20.486f, 4.515f)
                curveTo(21.853f, 5.881f, 21.378f, 8.572f, 19.425f, 10.525f)
                curveTo(17.823f, 12.127f, 15.725f, 12.734f, 14.268f, 12.146f)
                close()
            }
        }
        .build()
        return _restaurant2Fill!!
    }

private var _restaurant2Fill: ImageVector? = null
