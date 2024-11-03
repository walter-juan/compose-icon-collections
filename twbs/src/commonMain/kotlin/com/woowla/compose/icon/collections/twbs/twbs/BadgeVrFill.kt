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

public val Twbs.BadgeVrFill: ImageVector
    get() {
        if (_badgeVrFill != null) {
            return _badgeVrFill!!
        }
        _badgeVrFill = Builder(name = "BadgeVrFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.673f, 5.933f)
                verticalLineToRelative(1.938f)
                horizontalLineToRelative(1.033f)
                curveToRelative(0.66f, 0.0f, 1.068f, -0.316f, 1.068f, -0.95f)
                curveToRelative(0.0f, -0.64f, -0.422f, -0.988f, -1.05f, -0.988f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(5.937f, 11.0f)
                lineTo(7.927f, 5.001f)
                lineTo(6.61f, 5.001f)
                lineTo(5.277f, 9.708f)
                lineTo(5.22f, 9.708f)
                lineTo(3.875f, 5.001f)
                lineTo(2.5f, 5.001f)
                lineTo(4.508f, 11.0f)
                close()
                moveTo(8.5f, 5.001f)
                lineTo(8.5f, 11.0f)
                horizontalLineToRelative(1.173f)
                lineTo(9.673f, 8.763f)
                horizontalLineToRelative(1.064f)
                lineTo(11.787f, 11.0f)
                horizontalLineToRelative(1.327f)
                lineTo(11.91f, 8.583f)
                curveTo(12.455f, 8.373f, 13.0f, 7.779f, 13.0f, 6.9f)
                curveToRelative(0.0f, -1.147f, -0.773f, -1.9f, -2.105f, -1.9f)
                lineTo(8.5f, 5.0f)
                close()
            }
        }
        .build()
        return _badgeVrFill!!
    }

private var _badgeVrFill: ImageVector? = null
