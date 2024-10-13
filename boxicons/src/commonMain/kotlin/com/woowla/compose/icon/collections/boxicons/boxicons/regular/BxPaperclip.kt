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

public val RegularGroup.BxPaperclip: ImageVector
    get() {
        if (_bxPaperclip != null) {
            return _bxPaperclip!!
        }
        _bxPaperclip = Builder(name = "BxPaperclip", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.004f, 5.0f)
                horizontalLineTo(9.0f)
                curveToRelative(-1.838f, 0.0f, -3.586f, 0.737f, -4.924f, 2.076f)
                curveTo(2.737f, 8.415f, 2.0f, 10.163f, 2.0f, 12.0f)
                curveToRelative(0.0f, 1.838f, 0.737f, 3.586f, 2.076f, 4.924f)
                curveTo(5.414f, 18.263f, 7.162f, 19.0f, 9.0f, 19.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(9.0f)
                curveToRelative(-1.303f, 0.0f, -2.55f, -0.529f, -3.51f, -1.49f)
                curveTo(4.529f, 14.55f, 4.0f, 13.303f, 4.0f, 12.0f)
                curveToRelative(0.0f, -1.302f, 0.529f, -2.549f, 1.49f, -3.51f)
                curveTo(6.45f, 7.529f, 7.697f, 7.0f, 9.0f, 7.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(6.0f)
                lineToRelative(0.001f, 1.0f)
                horizontalLineToRelative(0.003f)
                curveToRelative(0.79f, 0.0f, 1.539f, 0.314f, 2.109f, 0.886f)
                curveToRelative(0.571f, 0.571f, 0.886f, 1.322f, 0.887f, 2.116f)
                arcToRelative(2.966f, 2.966f, 0.0f, false, true, -0.884f, 2.11f)
                arcTo(2.988f, 2.988f, 0.0f, false, true, 17.0f, 13.0f)
                horizontalLineTo(9.0f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, true, -0.698f, -0.3f)
                arcTo(0.991f, 0.991f, 0.0f, false, true, 8.0f, 12.0f)
                curveToRelative(0.0f, -0.252f, 0.11f, -0.507f, 0.301f, -0.698f)
                arcTo(0.987f, 0.987f, 0.0f, false, true, 9.0f, 11.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                curveToRelative(-0.79f, 0.0f, -1.541f, 0.315f, -2.114f, 0.889f)
                curveTo(6.314f, 10.461f, 6.0f, 11.211f, 6.0f, 12.0f)
                reflectiveCurveToRelative(0.314f, 1.54f, 0.888f, 2.114f)
                arcTo(2.974f, 2.974f, 0.0f, false, false, 9.0f, 15.0f)
                horizontalLineToRelative(8.001f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, false, 3.528f, -1.473f)
                arcToRelative(4.967f, 4.967f, 0.0f, false, false, -0.001f, -7.055f)
                arcTo(4.95f, 4.95f, 0.0f, false, false, 17.004f, 5.0f)
                close()
            }
        }
        .build()
        return _bxPaperclip!!
    }

private var _bxPaperclip: ImageVector? = null
