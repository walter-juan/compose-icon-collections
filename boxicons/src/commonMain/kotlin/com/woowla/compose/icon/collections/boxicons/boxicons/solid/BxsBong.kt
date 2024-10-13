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

public val SolidGroup.BxsBong: ImageVector
    get() {
        if (_bxsBong != null) {
            return _bxsBong!!
        }
        _bxsBong = Builder(name = "BxsBong", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.293f, 8.293f)
                lineToRelative(-2.069f, 2.069f)
                arcTo(7.017f, 7.017f, 0.0f, false, false, 15.0f, 8.681f)
                lineTo(15.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                lineTo(16.0f, 2.0f)
                lineTo(8.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.681f)
                arcTo(7.01f, 7.01f, 0.0f, false, false, 5.0f, 15.0f)
                curveToRelative(0.0f, 3.859f, 3.141f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                arcToRelative(6.958f, 6.958f, 0.0f, false, false, -0.652f, -2.934f)
                lineToRelative(2.359f, -2.359f)
                lineToRelative(-1.414f, -1.414f)
                close()
                moveTo(10.334f, 10.291f)
                lineTo(11.0f, 10.056f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.056f)
                lineToRelative(0.666f, 0.235f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 16.886f, 14.0f)
                lineTo(7.114f, 14.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 3.22f, -3.709f)
                close()
            }
        }
        .build()
        return _bxsBong!!
    }

private var _bxsBong: ImageVector? = null
