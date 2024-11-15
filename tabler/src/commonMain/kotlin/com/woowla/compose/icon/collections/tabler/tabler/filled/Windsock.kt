package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Windsock: ImageVector
    get() {
        if (_windsock != null) {
            return _windsock!!
        }
        _windsock = Builder(name = "Windsock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.079f)
                lineToRelative(11.083f, 0.924f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.917f, 0.997f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.917f, 0.997f)
                lineToRelative(-11.083f, 0.923f)
                verticalLineToRelative(8.08f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                moveToRelative(1.0f, 4.086f)
                verticalLineToRelative(3.827f)
                lineToRelative(3.0f, -0.25f)
                verticalLineToRelative(-3.327f)
                close()
                moveTo(14.0f, 6.67f)
                verticalLineToRelative(2.659f)
                lineToRelative(3.0f, -0.25f)
                verticalLineToRelative(-2.159f)
                close()
            }
        }
        .build()
        return _windsock!!
    }

private var _windsock: ImageVector? = null
