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

public val SolidGroup.BxsMouse: ImageVector
    get() {
        if (_bxsMouse != null) {
            return _bxsMouse!!
        }
        _bxsMouse = Builder(name = "BxsMouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.975f, 22.0f)
                horizontalLineTo(12.0f)
                curveToRelative(3.859f, 0.0f, 7.0f, -3.14f, 7.0f, -7.0f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -3.841f, -3.127f, -6.974f, -6.981f, -7.0f)
                horizontalLineToRelative(-0.06f)
                curveTo(8.119f, 2.022f, 5.0f, 5.157f, 5.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 3.86f, 3.129f, 7.0f, 6.975f, 7.0f)
                close()
                moveTo(11.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _bxsMouse!!
    }

private var _bxsMouse: ImageVector? = null
