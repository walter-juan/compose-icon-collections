package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxShower: ImageVector
    get() {
        if (_bxShower != null) {
            return _bxShower!!
        }
        _bxShower = Builder(name = "BxShower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 18.33f)
                arcTo(6.78f, 6.78f, 0.0f, false, false, 19.5f, 15.0f)
                arcToRelative(6.73f, 6.73f, 0.0f, false, false, -1.5f, 3.33f)
                arcToRelative(1.51f, 1.51f, 0.0f, true, false, 3.0f, 0.0f)
                close()
                moveTo(11.0f, 20.33f)
                arcTo(6.78f, 6.78f, 0.0f, false, false, 9.5f, 17.0f)
                arcTo(6.73f, 6.73f, 0.0f, false, false, 8.0f, 20.33f)
                arcTo(1.59f, 1.59f, 0.0f, false, false, 9.5f, 22.0f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, 1.5f, -1.67f)
                close()
                moveTo(14.5f, 22.0f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, 1.5f, -1.67f)
                arcTo(6.78f, 6.78f, 0.0f, false, false, 14.5f, 17.0f)
                arcToRelative(6.73f, 6.73f, 0.0f, false, false, -1.5f, 3.33f)
                arcTo(1.59f, 1.59f, 0.0f, false, false, 14.5f, 22.0f)
                close()
                moveTo(3.0f, 18.33f)
                arcTo(1.59f, 1.59f, 0.0f, false, false, 4.5f, 20.0f)
                arcTo(1.59f, 1.59f, 0.0f, false, false, 6.0f, 18.33f)
                arcTo(6.78f, 6.78f, 0.0f, false, false, 4.5f, 15.0f)
                arcTo(6.73f, 6.73f, 0.0f, false, false, 3.0f, 18.33f)
                close()
                moveTo(13.0f, 4.07f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.07f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 12.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.0f, -7.93f)
                close()
                moveTo(6.0f, 12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bxShower!!
    }

private var _bxShower: ImageVector? = null
