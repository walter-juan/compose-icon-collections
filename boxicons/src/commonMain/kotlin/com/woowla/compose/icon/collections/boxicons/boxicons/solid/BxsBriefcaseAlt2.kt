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

public val SolidGroup.BxsBriefcaseAlt2: ImageVector
    get() {
        if (_bxsBriefcaseAlt2 != null) {
            return _bxsBriefcaseAlt2!!
        }
        _bxsBriefcaseAlt2 = Builder(name = "BxsBriefcaseAlt2", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(17.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(9.0f, 2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 6.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                lineTo(22.0f, 8.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(9.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 6.0f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(17.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(9.0f, 13.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bxsBriefcaseAlt2!!
    }

private var _bxsBriefcaseAlt2: ImageVector? = null
