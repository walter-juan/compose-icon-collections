package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxCalendarHeart: ImageVector
    get() {
        if (_bxCalendarHeart != null) {
            return _bxCalendarHeart!!
        }
        _bxCalendarHeart = Builder(name = "BxCalendarHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.648f, 14.711f)
                lineTo(11.997f, 18.0f)
                lineToRelative(3.35f, -3.289f)
                arcToRelative(2.129f, 2.129f, 0.0f, false, false, 0.0f, -3.069f)
                arcToRelative(2.225f, 2.225f, 0.0f, false, false, -3.126f, 0.0f)
                lineToRelative(-0.224f, 0.219f)
                lineToRelative(-0.224f, -0.219f)
                arcToRelative(2.224f, 2.224f, 0.0f, false, false, -3.125f, 0.0f)
                arcToRelative(2.129f, 2.129f, 0.0f, false, false, 0.0f, 3.069f)
                close()
            }
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
                moveTo(19.002f, 20.0f)
                lineTo(5.0f, 20.0f)
                lineTo(5.0f, 8.0f)
                horizontalLineToRelative(14.0f)
                lineToRelative(0.002f, 12.0f)
                close()
            }
        }
        .build()
        return _bxCalendarHeart!!
    }

private var _bxCalendarHeart: ImageVector? = null