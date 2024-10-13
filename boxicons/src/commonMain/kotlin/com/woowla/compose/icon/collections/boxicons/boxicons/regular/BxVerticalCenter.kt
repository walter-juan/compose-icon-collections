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

public val RegularGroup.BxVerticalCenter: ImageVector
    get() {
        if (_bxVerticalCenter != null) {
            return _bxVerticalCenter!!
        }
        _bxVerticalCenter = Builder(name = "BxVerticalCenter", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 5.0f)
                lineTo(13.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 5.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(4.0f, -4.0f)
                close()
                moveTo(13.0f, 22.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-4.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(3.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 13.0f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 13.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(18.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _bxVerticalCenter!!
    }

private var _bxVerticalCenter: ImageVector? = null
