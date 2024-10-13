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

public val SolidGroup.BxsCalendarHeart: ImageVector
    get() {
        if (_bxsCalendarHeart != null) {
            return _bxsCalendarHeart!!
        }
        _bxsCalendarHeart = Builder(name = "BxsCalendarHeart", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 4.0f)
                lineTo(9.0f, 2.0f)
                lineTo(7.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(21.0f, 6.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(15.352f, 15.711f)
                lineTo(12.002f, 19.0f)
                lineToRelative(-3.349f, -3.289f)
                arcToRelative(2.129f, 2.129f, 0.0f, false, true, 0.0f, -3.069f)
                arcToRelative(2.224f, 2.224f, 0.0f, false, true, 3.125f, 0.0f)
                lineToRelative(0.224f, 0.219f)
                lineToRelative(0.224f, -0.219f)
                arcToRelative(2.225f, 2.225f, 0.0f, false, true, 3.126f, 0.0f)
                arcToRelative(2.129f, 2.129f, 0.0f, false, true, 0.0f, 3.069f)
                close()
                moveTo(19.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                lineTo(5.0f, 7.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bxsCalendarHeart!!
    }

private var _bxsCalendarHeart: ImageVector? = null
