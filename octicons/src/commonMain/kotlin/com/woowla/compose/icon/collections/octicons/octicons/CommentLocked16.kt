package com.woowla.compose.icon.collections.octicons.octicons

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
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.CommentLocked16: ImageVector
    get() {
        if (_commentLocked16 != null) {
            return _commentLocked16!!
        }
        _commentLocked16 = Builder(name = "CommentLocked16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(1.168f)
                curveToRelative(0.591f, 0.281f, 1.0f, 0.884f, 1.0f, 1.582f)
                verticalLineToRelative(2.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 16.0f)
                horizontalLineToRelative(-4.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 8.0f, 14.25f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.698f, 0.409f, -1.301f, 1.0f, -1.582f)
                lineTo(9.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
                moveTo(12.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.25f, 1.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 12.0f, 2.75f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, 0.25f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.199f, 0.0f, 0.39f, 0.079f, 0.53f, 0.22f)
                curveToRelative(0.141f, 0.14f, 0.22f, 0.331f, 0.22f, 0.53f)
                verticalLineToRelative(2.19f)
                lineToRelative(2.72f, -2.72f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.53f, -0.22f)
                horizontalLineToRelative(0.35f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-0.039f)
                lineToRelative(-2.574f, 2.573f)
                arcTo(1.457f, 1.457f, 0.0f, false, true, 2.0f, 11.543f)
                lineTo(2.0f, 10.0f)
                horizontalLineToRelative(-0.25f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 8.25f)
                verticalLineToRelative(-5.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.75f, 1.0f)
                horizontalLineToRelative(8.5f)
                close()
                moveTo(14.25f, 3.0f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(0.75f)
                curveToRelative(0.0f, -0.061f, -0.003f, -0.115f, -0.006f, -0.164f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 14.5f, 5.25f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.53f, -0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.0f, -1.06f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.53f, -0.22f)
                horizontalLineToRelative(0.5f)
                close()
            }
        }
        .build()
        return _commentLocked16!!
    }

private var _commentLocked16: ImageVector? = null
