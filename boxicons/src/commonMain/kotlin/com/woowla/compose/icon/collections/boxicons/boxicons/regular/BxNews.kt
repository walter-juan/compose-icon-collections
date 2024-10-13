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

public val RegularGroup.BxNews: ImageVector
    get() {
        if (_bxNews != null) {
            return _bxNews!!
        }
        _bxNews = Builder(name = "BxNews", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.875f, 3.0f)
                lineTo(4.125f, 3.0f)
                curveTo(2.953f, 3.0f, 2.0f, 3.897f, 2.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.103f, 0.953f, 2.0f, 2.125f, 2.0f)
                horizontalLineToRelative(15.75f)
                curveTo(21.047f, 21.0f, 22.0f, 20.103f, 22.0f, 19.0f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -1.103f, -0.953f, -2.0f, -2.125f, -2.0f)
                close()
                moveTo(19.875f, 19.0f)
                lineTo(4.125f, 19.0f)
                curveToRelative(-0.057f, 0.0f, -0.096f, -0.016f, -0.113f, -0.016f)
                curveToRelative(-0.007f, 0.0f, -0.011f, 0.002f, -0.012f, 0.008f)
                lineTo(3.988f, 5.046f)
                curveToRelative(0.007f, -0.01f, 0.052f, -0.046f, 0.137f, -0.046f)
                horizontalLineToRelative(15.75f)
                curveToRelative(0.079f, 0.001f, 0.122f, 0.028f, 0.125f, 0.008f)
                lineToRelative(0.012f, 13.946f)
                curveToRelative(-0.007f, 0.01f, -0.052f, 0.046f, -0.137f, 0.046f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                lineTo(6.0f, 13.0f)
                close()
                moveTo(13.0f, 15.0f)
                lineTo(6.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(14.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(14.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _bxNews!!
    }

private var _bxNews: ImageVector? = null
