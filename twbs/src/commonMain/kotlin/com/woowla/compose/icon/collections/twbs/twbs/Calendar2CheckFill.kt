package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Calendar2CheckFill: ImageVector
    get() {
        if (_calendar2CheckFill != null) {
            return _calendar2CheckFill!!
        }
        _calendar2CheckFill = Builder(name = "Calendar2CheckFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                moveToRelative(9.954f, 3.0f)
                horizontalLineTo(2.545f)
                curveToRelative(-0.3f, 0.0f, -0.545f, 0.224f, -0.545f, 0.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.276f, 0.244f, 0.5f, 0.545f, 0.5f)
                horizontalLineToRelative(10.91f)
                curveToRelative(0.3f, 0.0f, 0.545f, -0.224f, 0.545f, -0.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.276f, -0.244f, -0.5f, -0.546f, -0.5f)
                moveToRelative(-2.6f, 5.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, -0.708f)
                lineTo(7.5f, 10.793f)
                lineTo(6.354f, 9.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.708f, 0.708f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.0f)
                close()
            }
        }
        .build()
        return _calendar2CheckFill!!
    }

private var _calendar2CheckFill: ImageVector? = null
