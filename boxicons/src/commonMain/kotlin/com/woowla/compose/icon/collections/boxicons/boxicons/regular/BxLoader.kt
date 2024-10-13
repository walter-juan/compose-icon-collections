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

public val RegularGroup.BxLoader: ImageVector
    get() {
        if (_bxLoader != null) {
            return _bxLoader!!
        }
        _bxLoader = Builder(name = "BxLoader", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 11.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 13.0f)
                close()
                moveTo(17.0f, 11.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(11.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(4.222f, 5.636f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.536f, 3.536f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(19.778f, 18.364f)
                lineTo(18.364f, 19.778f)
                lineTo(14.828f, 16.242f)
                lineTo(16.242f, 14.828f)
                close()
                moveTo(7.758f, 14.828f)
                lineTo(9.172f, 16.242f)
                lineTo(5.636f, 19.778f)
                lineTo(4.222f, 18.364f)
                close()
                moveTo(14.828f, 7.757f)
                lineTo(18.364f, 4.222f)
                lineTo(19.778f, 5.637f)
                lineTo(16.242f, 9.172f)
                close()
            }
        }
        .build()
        return _bxLoader!!
    }

private var _bxLoader: ImageVector? = null
