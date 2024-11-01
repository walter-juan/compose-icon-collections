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

public val FilledGroup.BrandTabler: ImageVector
    get() {
        if (_brandTabler != null) {
            return _brandTabler!!
        }
        _brandTabler = Builder(name = "BrandTabler", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, 5.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.0f, -5.0f)
                verticalLineToRelative(-10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, -5.0f)
                close()
                moveTo(16.0f, 14.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-7.293f, -5.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.083f, 1.32f)
                lineToRelative(2.292f, 2.293f)
                lineToRelative(-2.292f, 2.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 1.414f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f)
                close()
            }
        }
        .build()
        return _brandTabler!!
    }

private var _brandTabler: ImageVector? = null
