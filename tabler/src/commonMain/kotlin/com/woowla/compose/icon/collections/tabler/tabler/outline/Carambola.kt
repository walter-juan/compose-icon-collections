package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.Carambola: ImageVector
    get() {
        if (_carambola != null) {
            return _carambola!!
        }
        _carambola = Builder(name = "Carambola", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.286f, 21.09f)
                quadToRelative(-1.69f, 0.001f, -5.288f, -2.615f)
                quadToRelative(-3.596f, 2.617f, -5.288f, 2.616f)
                quadToRelative(-2.726f, 0.0f, -0.495f, -6.8f)
                quadToRelative(-9.389f, -6.775f, 2.135f, -6.775f)
                horizontalLineToRelative(0.076f)
                quadToRelative(1.785f, -5.516f, 3.574f, -5.516f)
                quadToRelative(1.785f, 0.0f, 3.574f, 5.516f)
                horizontalLineToRelative(0.076f)
                quadToRelative(11.525f, 0.0f, 2.133f, 6.774f)
                quadToRelative(2.23f, 6.802f, -0.497f, 6.8f)
            }
        }
        .build()
        return _carambola!!
    }

private var _carambola: ImageVector? = null
