package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.NavigationLine: ImageVector
    get() {
        if (_navigationLine != null) {
            return _navigationLine!!
        }
        _navigationLine = Builder(name = "NavigationLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.965f, 5.096f)
                lineTo(8.511f, 17.507f)
                lineTo(11.551f, 11.425f)
                lineTo(17.188f, 9.171f)
                lineTo(4.965f, 5.096f)
                close()
                moveTo(2.899f, 2.3f)
                lineTo(21.705f, 8.568f)
                curveTo(21.967f, 8.656f, 22.109f, 8.939f, 22.021f, 9.201f)
                curveTo(21.975f, 9.34f, 21.869f, 9.452f, 21.733f, 9.507f)
                lineTo(13.0f, 13.0f)
                lineTo(8.575f, 21.85f)
                curveTo(8.452f, 22.097f, 8.151f, 22.197f, 7.904f, 22.074f)
                curveTo(7.779f, 22.011f, 7.686f, 21.899f, 7.647f, 21.764f)
                lineTo(2.261f, 2.911f)
                curveTo(2.185f, 2.646f, 2.338f, 2.369f, 2.604f, 2.293f)
                curveTo(2.701f, 2.265f, 2.804f, 2.268f, 2.899f, 2.3f)
                close()
            }
        }
        .build()
        return _navigationLine!!
    }

private var _navigationLine: ImageVector? = null
