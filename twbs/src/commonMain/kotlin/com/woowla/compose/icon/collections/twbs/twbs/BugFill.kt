package com.woowla.compose.icon.collections.twbs.twbs

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
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.BugFill: ImageVector
    get() {
        if (_bugFill != null) {
            return _bugFill!!
        }
        _bugFill = Builder(name = "BugFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.978f, 0.855f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.956f, 0.29f)
                lineToRelative(0.41f, 1.352f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 3.0f, 6.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -1.432f, -3.503f)
                lineToRelative(0.41f, -1.352f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.956f, -0.29f)
                lineToRelative(-0.291f, 0.956f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 8.0f, 1.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -2.731f, 0.811f)
                lineToRelative(-0.29f, -0.956f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 6.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.5f, 7.0f)
                verticalLineToRelative(8.975f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 13.0f, 11.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 1.0f, 0.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                lineTo(13.0f, 10.0f)
                lineTo(13.0f, 9.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(13.0f, 8.0f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 5.5f)
                lineTo(15.0f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                close()
                moveTo(7.5f, 15.975f)
                lineTo(7.5f, 7.0f)
                lineTo(3.0f, 7.0f)
                lineTo(3.0f, 6.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(2.0f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.5f, 7.0f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(1.0f)
                lineTo(1.5f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.0f, 11.5f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 1.0f, 0.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                lineTo(3.0f, 11.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.5f, 4.975f)
            }
        }
        .build()
        return _bugFill!!
    }

private var _bugFill: ImageVector? = null
