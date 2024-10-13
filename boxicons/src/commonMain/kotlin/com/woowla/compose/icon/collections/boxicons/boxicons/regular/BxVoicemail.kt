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

public val RegularGroup.BxVoicemail: ImageVector
    get() {
        if (_bxVoicemail != null) {
            return _bxVoicemail!!
        }
        _bxVoicemail = Builder(name = "BxVoicemail", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 8.0f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, false, -4.5f, 4.5f)
                curveToRelative(0.0f, 0.925f, 0.281f, 1.784f, 0.762f, 2.5f)
                horizontalLineToRelative(-3.523f)
                curveToRelative(0.48f, -0.716f, 0.761f, -1.575f, 0.761f, -2.5f)
                curveTo(11.0f, 10.019f, 8.981f, 8.0f, 6.5f, 8.0f)
                reflectiveCurveTo(2.0f, 10.019f, 2.0f, 12.5f)
                reflectiveCurveTo(4.019f, 17.0f, 6.5f, 17.0f)
                curveToRelative(0.171f, 0.0f, 0.334f, -0.032f, 0.5f, -0.051f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-0.051f)
                curveToRelative(2.244f, -0.252f, 4.0f, -2.139f, 4.0f, -4.449f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(4.0f, 12.5f)
                curveTo(4.0f, 11.121f, 5.121f, 10.0f, 6.5f, 10.0f)
                reflectiveCurveTo(9.0f, 11.121f, 9.0f, 12.5f)
                reflectiveCurveTo(7.879f, 15.0f, 6.5f, 15.0f)
                reflectiveCurveTo(4.0f, 13.879f, 4.0f, 12.5f)
                close()
                moveTo(17.5f, 15.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _bxVoicemail!!
    }

private var _bxVoicemail: ImageVector? = null
