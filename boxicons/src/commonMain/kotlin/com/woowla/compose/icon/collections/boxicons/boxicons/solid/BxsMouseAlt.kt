package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsMouseAlt: ImageVector
    get() {
        if (_bxsMouseAlt != null) {
            return _bxsMouseAlt!!
        }
        _bxsMouseAlt = Builder(name = "BxsMouseAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(6.0f)
                lineTo(19.0f, 8.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(5.0f, 16.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                verticalLineToRelative(-4.0f)
                lineTo(5.0f, 12.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(5.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                lineTo(11.0f, 2.0f)
                curveTo(7.691f, 2.0f, 5.0f, 4.691f, 5.0f, 8.0f)
                close()
            }
        }
        .build()
        return _bxsMouseAlt!!
    }

private var _bxsMouseAlt: ImageVector? = null
