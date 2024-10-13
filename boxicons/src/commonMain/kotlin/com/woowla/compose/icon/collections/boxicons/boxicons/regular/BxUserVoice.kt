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

public val RegularGroup.BxUserVoice: ImageVector
    get() {
        if (_bxUserVoice != null) {
            return _bxUserVoice!!
        }
        _bxUserVoice = Builder(name = "BxUserVoice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                curveToRelative(2.28f, 0.0f, 4.0f, -1.72f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.72f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.72f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.72f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(8.0f, 6.0f)
                curveToRelative(1.178f, 0.0f, 2.0f, 0.822f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.822f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.822f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.822f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(9.0f, 13.0f)
                lineTo(7.0f, 13.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(18.364f, 2.636f)
                lineTo(16.95f, 4.05f)
                curveTo(18.271f, 5.373f, 19.0f, 7.131f, 19.0f, 9.0f)
                reflectiveCurveToRelative(-0.729f, 3.627f, -2.05f, 4.95f)
                lineToRelative(1.414f, 1.414f)
                curveTo(20.064f, 13.663f, 21.0f, 11.403f, 21.0f, 9.0f)
                reflectiveCurveToRelative(-0.936f, -4.663f, -2.636f, -6.364f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.535f, 5.464f)
                lineTo(14.121f, 6.88f)
                curveTo(14.688f, 7.445f, 15.0f, 8.198f, 15.0f, 9.0f)
                reflectiveCurveToRelative(-0.312f, 1.555f, -0.879f, 2.12f)
                lineToRelative(1.414f, 1.416f)
                curveTo(16.479f, 11.592f, 17.0f, 10.337f, 17.0f, 9.0f)
                reflectiveCurveToRelative(-0.521f, -2.592f, -1.465f, -3.536f)
                close()
            }
        }
        .build()
        return _bxUserVoice!!
    }

private var _bxUserVoice: ImageVector? = null
