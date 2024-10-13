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

public val RegularGroup.BxChair: ImageVector
    get() {
        if (_bxChair != null) {
            return _bxChair!!
        }
        _bxChair = Builder(name = "BxChair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 13.0f)
                lineTo(19.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(7.0f, 2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(17.0f, 4.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 4.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.0f)
                lineTo(7.0f, 13.0f)
                lineTo(7.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bxChair!!
    }

private var _bxChair: ImageVector? = null
