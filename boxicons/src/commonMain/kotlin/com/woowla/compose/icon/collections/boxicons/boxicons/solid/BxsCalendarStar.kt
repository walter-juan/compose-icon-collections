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

public val SolidGroup.BxsCalendarStar: ImageVector
    get() {
        if (_bxsCalendarStar != null) {
            return _bxsCalendarStar!!
        }
        _bxsCalendarStar = Builder(name = "BxsCalendarStar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(14.412f, 19.0f)
                lineTo(11.963f, 17.712f)
                lineTo(9.514f, 19.0f)
                lineToRelative(0.468f, -2.728f)
                lineTo(8.0f, 14.342f)
                lineToRelative(2.738f, -0.398f)
                lineToRelative(1.225f, -2.48f)
                lineToRelative(1.225f, 2.48f)
                lineToRelative(2.738f, 0.398f)
                lineToRelative(-1.981f, 1.931f)
                lineToRelative(0.467f, 2.727f)
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
        return _bxsCalendarStar!!
    }

private var _bxsCalendarStar: ImageVector? = null
