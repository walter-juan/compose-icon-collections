package com.woowla.compose.icon.collections.remix.remix.healthandmedical

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.HealthAndMedicalGroup

public val HealthAndMedicalGroup.Brain2Fill: ImageVector
    get() {
        if (_brain2Fill != null) {
            return _brain2Fill!!
        }
        _brain2Fill = Builder(name = "Brain2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 2.0f)
                curveTo(6.567f, 2.0f, 5.0f, 3.567f, 5.0f, 5.5f)
                curveTo(5.0f, 5.68f, 5.014f, 5.857f, 5.04f, 6.03f)
                curveTo(3.324f, 6.255f, 2.0f, 7.723f, 2.0f, 9.5f)
                curveTo(2.0f, 10.479f, 2.402f, 11.365f, 3.051f, 12.0f)
                curveTo(2.402f, 12.635f, 2.0f, 13.521f, 2.0f, 14.5f)
                curveTo(2.0f, 15.902f, 2.824f, 17.11f, 4.014f, 17.669f)
                curveTo(4.005f, 17.778f, 4.0f, 17.889f, 4.0f, 18.0f)
                curveTo(4.0f, 20.209f, 5.791f, 22.0f, 8.0f, 22.0f)
                curveTo(9.195f, 22.0f, 10.267f, 21.476f, 11.0f, 20.646f)
                verticalLineTo(3.051f)
                curveTo(10.365f, 2.402f, 9.479f, 2.0f, 8.5f, 2.0f)
                close()
                moveTo(13.0f, 3.051f)
                verticalLineTo(20.646f)
                curveTo(13.733f, 21.476f, 14.805f, 22.0f, 16.0f, 22.0f)
                curveTo(18.209f, 22.0f, 20.0f, 20.209f, 20.0f, 18.0f)
                curveTo(20.0f, 17.889f, 19.995f, 17.778f, 19.986f, 17.669f)
                curveTo(21.176f, 17.11f, 22.0f, 15.902f, 22.0f, 14.5f)
                curveTo(22.0f, 13.521f, 21.598f, 12.635f, 20.949f, 12.0f)
                curveTo(21.598f, 11.365f, 22.0f, 10.479f, 22.0f, 9.5f)
                curveTo(22.0f, 7.723f, 20.676f, 6.255f, 18.96f, 6.03f)
                curveTo(18.986f, 5.857f, 19.0f, 5.68f, 19.0f, 5.5f)
                curveTo(19.0f, 3.567f, 17.433f, 2.0f, 15.5f, 2.0f)
                curveTo(14.521f, 2.0f, 13.635f, 2.402f, 13.0f, 3.051f)
                close()
            }
        }
        .build()
        return _brain2Fill!!
    }

private var _brain2Fill: ImageVector? = null
