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

public val SolidGroup.BxsUserBadge: ImageVector
    get() {
        if (_bxsUserBadge != null) {
            return _bxsUserBadge!!
        }
        _bxsUserBadge = Builder(name = "BxsUserBadge", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.988f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(19.988f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(6.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(11.988f)
                close()
                moveTo(9.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 7.0f)
                lineTo(9.0f, 5.0f)
                close()
                moveTo(14.25f, 11.25f)
                arcTo(2.26f, 2.26f, 0.0f, false, true, 12.0f, 13.501f)
                curveToRelative(-1.235f, 0.0f, -2.25f, -1.015f, -2.25f, -2.251f)
                reflectiveCurveTo(10.765f, 9.0f, 12.0f, 9.0f)
                arcToRelative(2.259f, 2.259f, 0.0f, false, true, 2.25f, 2.25f)
                close()
                moveTo(7.5f, 18.188f)
                curveToRelative(0.0f, -1.664f, 2.028f, -3.375f, 4.5f, -3.375f)
                reflectiveCurveToRelative(4.5f, 1.711f, 4.5f, 3.375f)
                verticalLineToRelative(0.563f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-0.563f)
                close()
            }
        }
        .build()
        return _bxsUserBadge!!
    }

private var _bxsUserBadge: ImageVector? = null
