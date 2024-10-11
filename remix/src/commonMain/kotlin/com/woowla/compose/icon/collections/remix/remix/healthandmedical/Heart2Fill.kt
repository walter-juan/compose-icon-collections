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

public val HealthAndMedicalGroup.Heart2Fill: ImageVector
    get() {
        if (_heart2Fill != null) {
            return _heart2Fill!!
        }
        _heart2Fill = Builder(name = "Heart2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.243f, 4.757f)
                curveTo(22.505f, 7.025f, 22.583f, 10.637f, 20.479f, 12.993f)
                lineTo(12.0f, 21.485f)
                lineTo(3.521f, 12.993f)
                curveTo(1.417f, 10.637f, 1.496f, 7.019f, 3.757f, 4.757f)
                curveTo(5.515f, 2.999f, 8.093f, 2.56f, 10.26f, 3.44f)
                lineTo(6.343f, 7.358f)
                lineTo(7.757f, 8.773f)
                lineTo(12.0f, 4.53f)
                lineTo(11.987f, 4.516f)
                curveTo(11.992f, 4.52f, 11.996f, 4.524f, 12.001f, 4.529f)
                curveTo(14.35f, 2.42f, 17.98f, 2.49f, 20.243f, 4.757f)
                close()
            }
        }
        .build()
        return _heart2Fill!!
    }

private var _heart2Fill: ImageVector? = null
