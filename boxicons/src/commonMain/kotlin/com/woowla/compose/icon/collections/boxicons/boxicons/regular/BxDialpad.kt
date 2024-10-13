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

public val RegularGroup.BxDialpad: ImageVector
    get() {
        if (_bxDialpad != null) {
            return _bxDialpad!!
        }
        _bxDialpad = Builder(name = "BxDialpad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(10.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(10.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(16.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(16.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(16.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 6.0f)
                close()
                moveTo(4.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 11.0f)
                close()
                moveTo(4.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 16.0f)
                close()
                moveTo(10.0f, 18.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _bxDialpad!!
    }

private var _bxDialpad: ImageVector? = null
