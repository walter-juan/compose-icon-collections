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

public val Twbs.BriefcaseFill: ImageVector
    get() {
        if (_briefcaseFill != null) {
            return _briefcaseFill!!
        }
        _briefcaseFill = Builder(name = "BriefcaseFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.0f, 2.5f)
                lineTo(5.0f, 3.0f)
                lineTo(1.5f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 4.5f)
                verticalLineToRelative(1.384f)
                lineToRelative(7.614f, 2.03f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.772f, 0.0f)
                lineTo(16.0f, 5.884f)
                lineTo(16.0f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 3.0f)
                lineTo(11.0f, 3.0f)
                verticalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 1.0f)
                close()
                moveTo(6.5f, 2.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(10.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 14.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineTo(6.85f)
                lineTo(8.129f, 8.947f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.258f, 0.0f)
                lineTo(0.0f, 6.85f)
                close()
            }
        }
        .build()
        return _briefcaseFill!!
    }

private var _briefcaseFill: ImageVector? = null
