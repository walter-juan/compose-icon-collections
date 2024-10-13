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

public val RegularGroup.BxBriefcaseAlt: ImageVector
    get() {
        if (_bxBriefcaseAlt != null) {
            return _bxBriefcaseAlt!!
        }
        _bxBriefcaseAlt = Builder(name = "BxBriefcaseAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(22.0f, 8.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(16.0f, 8.0f)
                verticalLineToRelative(11.0f)
                lineTo(8.0f, 19.0f)
                lineTo(8.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(15.0f, 4.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 6.0f)
                lineTo(9.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(4.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(11.0f)
                lineTo(4.0f, 19.0f)
                lineTo(4.0f, 8.0f)
                close()
                moveTo(18.0f, 19.0f)
                lineTo(18.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.001f, 11.0f)
                lineTo(18.0f, 19.0f)
                close()
            }
        }
        .build()
        return _bxBriefcaseAlt!!
    }

private var _bxBriefcaseAlt: ImageVector? = null
