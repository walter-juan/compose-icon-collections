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

public val RegularGroup.BxFullscreen: ImageVector
    get() {
        if (_bxFullscreen != null) {
            return _bxFullscreen!!
        }
        _bxFullscreen = Builder(name = "BxFullscreen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                lineTo(10.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                verticalLineToRelative(-5.0f)
                lineTo(3.0f, 14.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(21.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(19.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                lineTo(21.0f, 3.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _bxFullscreen!!
    }

private var _bxFullscreen: ImageVector? = null
