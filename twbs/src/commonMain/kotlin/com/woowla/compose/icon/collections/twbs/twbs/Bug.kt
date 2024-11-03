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

public val Twbs.Bug: ImageVector
    get() {
        if (_bug != null) {
            return _bug!!
        }
        _bug = Builder(name = "Bug", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.355f, 0.522f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.623f, 0.333f)
                lineToRelative(0.291f, 0.956f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 8.0f, 1.0f)
                curveToRelative(1.007f, 0.0f, 1.946f, 0.298f, 2.731f, 0.811f)
                lineToRelative(0.29f, -0.956f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.957f, 0.29f)
                lineToRelative(-0.41f, 1.352f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 13.0f, 6.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(14.0f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 7.0f)
                lineTo(13.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(13.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(13.0f, 11.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -10.0f, 0.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                verticalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 10.0f)
                lineTo(3.0f, 10.0f)
                lineTo(3.0f, 9.0f)
                lineTo(1.5f, 9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(3.0f, 8.0f)
                lineTo(3.0f, 7.0f)
                horizontalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.0f, 5.5f)
                lineTo(1.0f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                lineTo(3.0f, 6.0f)
                curveToRelative(0.0f, -1.364f, 0.547f, -2.601f, 1.432f, -3.503f)
                lineToRelative(-0.41f, -1.352f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.333f, -0.623f)
                moveTo(4.0f, 7.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.5f, 3.97f)
                lineTo(7.5f, 7.0f)
                close()
                moveTo(8.5f, 7.0f)
                verticalLineToRelative(7.97f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 11.0f)
                lineTo(12.0f, 7.0f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.334f, -2.982f)
                arcTo(3.98f, 3.98f, 0.0f, false, false, 8.0f, 2.0f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, false, -2.667f, 1.018f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 4.0f, 6.0f)
                close()
            }
        }
        .build()
        return _bug!!
    }

private var _bug: ImageVector? = null
