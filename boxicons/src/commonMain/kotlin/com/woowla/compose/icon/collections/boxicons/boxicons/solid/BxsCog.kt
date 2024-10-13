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

public val SolidGroup.BxsCog: ImageVector
    get() {
        if (_bxsCog != null) {
            return _bxsCog!!
        }
        _bxsCog = Builder(name = "BxsCog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.344f, 15.271f)
                lineToRelative(2.0f, 3.46f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.366f, 0.365f)
                lineToRelative(1.396f, -0.806f)
                curveToRelative(0.58f, 0.457f, 1.221f, 0.832f, 1.895f, 1.112f)
                verticalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.598f)
                arcToRelative(8.094f, 8.094f, 0.0f, false, false, 1.895f, -1.112f)
                lineToRelative(1.396f, 0.806f)
                curveToRelative(0.477f, 0.275f, 1.091f, 0.11f, 1.366f, -0.365f)
                lineToRelative(2.0f, -3.46f)
                arcToRelative(1.004f, 1.004f, 0.0f, false, false, -0.365f, -1.366f)
                lineToRelative(-1.372f, -0.793f)
                arcToRelative(7.683f, 7.683f, 0.0f, false, false, -0.002f, -2.224f)
                lineToRelative(1.372f, -0.793f)
                curveToRelative(0.476f, -0.275f, 0.641f, -0.89f, 0.365f, -1.366f)
                lineToRelative(-2.0f, -3.46f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.366f, -0.365f)
                lineToRelative(-1.396f, 0.806f)
                arcTo(8.034f, 8.034f, 0.0f, false, false, 15.0f, 4.598f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(1.598f)
                arcTo(8.094f, 8.094f, 0.0f, false, false, 7.105f, 5.71f)
                lineTo(5.71f, 4.904f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.366f, 0.365f)
                lineToRelative(-2.0f, 3.46f)
                arcToRelative(1.004f, 1.004f, 0.0f, false, false, 0.365f, 1.366f)
                lineToRelative(1.372f, 0.793f)
                arcToRelative(7.683f, 7.683f, 0.0f, false, false, 0.0f, 2.224f)
                lineToRelative(-1.372f, 0.793f)
                curveToRelative(-0.476f, 0.275f, -0.641f, 0.89f, -0.365f, 1.366f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _bxsCog!!
    }

private var _bxsCog: ImageVector? = null
