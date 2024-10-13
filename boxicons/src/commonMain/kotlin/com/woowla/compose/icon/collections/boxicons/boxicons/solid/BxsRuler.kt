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

public val SolidGroup.BxsRuler: ImageVector
    get() {
        if (_bxsRuler != null) {
            return _bxsRuler!!
        }
        _bxsRuler = Builder(name = "BxsRuler", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.875f, 7.0f)
                lineTo(3.125f, 7.0f)
                curveTo(1.953f, 7.0f, 1.0f, 7.897f, 1.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.103f, 0.953f, 2.0f, 2.125f, 2.0f)
                horizontalLineToRelative(17.75f)
                curveTo(22.047f, 17.0f, 23.0f, 16.103f, 23.0f, 15.0f)
                lineTo(23.0f, 9.0f)
                curveToRelative(0.0f, -1.103f, -0.953f, -2.0f, -2.125f, -2.0f)
                close()
                moveTo(7.0f, 12.0f)
                lineTo(5.0f, 12.0f)
                lineTo(5.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(11.0f, 13.0f)
                lineTo(9.0f, 13.0f)
                lineTo(9.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(15.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(19.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _bxsRuler!!
    }

private var _bxsRuler: ImageVector? = null
