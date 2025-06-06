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

public val OutlineGroup.BrandGoogle: ImageVector
    get() {
        if (_brandGoogle != null) {
            return _brandGoogle!!
        }
        _brandGoogle = Builder(name = "BrandGoogle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.945f, 11.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -3.284f, -5.997f)
                lineToRelative(-2.655f, 2.392f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 2.119f, 6.605f)
                horizontalLineToRelative(-4.125f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(7.945f)
                close()
            }
        }
        .build()
        return _brandGoogle!!
    }

private var _brandGoogle: ImageVector? = null
