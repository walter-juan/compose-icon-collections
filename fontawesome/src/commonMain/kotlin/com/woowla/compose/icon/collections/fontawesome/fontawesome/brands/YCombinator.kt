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

public val BrandsGroup.YCombinator: ImageVector
    get() {
        if (_yCombinator != null) {
            return _yCombinator!!
        }
        _yCombinator = Builder(name = "YCombinator", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 32.0f)
                lineToRelative(0.0f, 448.0f)
                lineToRelative(-448.0f, 0.0f)
                lineToRelative(0.0f, -448.0f)
                lineToRelative(448.0f, 0.0f)
                close()
                moveTo(236.0f, 287.5f)
                lineToRelative(77.5f, -145.5f)
                lineToRelative(-32.7f, 0.0f)
                lineToRelative(-45.8f, 91.0f)
                curveToRelative(-4.7f, 9.3f, -9.0f, 18.3f, -12.8f, 26.8f)
                lineToRelative(-12.2f, -26.8f)
                lineToRelative(-45.2f, -91.0f)
                lineToRelative(-35.0f, 0.0f)
                lineToRelative(76.7f, 143.8f)
                lineToRelative(0.0f, 94.5f)
                lineToRelative(29.5f, 0.0f)
                lineToRelative(0.0f, -92.8f)
                close()
            }
        }
        .build()
        return _yCombinator!!
    }

private var _yCombinator: ImageVector? = null
