package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.ArrowUpRightDots: ImageVector
    get() {
        if (_arrowUpRightDots != null) {
            return _arrowUpRightDots!!
        }
        _arrowUpRightDots = Builder(name = "ArrowUpRightDots", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 32.0f)
                curveTo(78.3f, 32.0f, 64.0f, 46.3f, 64.0f, 64.0f)
                reflectiveCurveTo(78.3f, 96.0f, 96.0f, 96.0f)
                lineTo(114.7f, 96.0f)
                lineTo(9.4f, 201.4f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.8f, 0.0f, 45.3f)
                reflectiveCurveToRelative(32.8f, 12.5f, 45.3f, 0.0f)
                lineTo(160.0f, 141.3f)
                lineTo(160.0f, 160.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(96.0f, 32.0f)
                close()
                moveTo(403.8f, 70.1f)
                arcToRelative(38.1f, 38.1f, 0.0f, true, false, 76.2f, 0.0f)
                arcToRelative(38.1f, 38.1f, 0.0f, true, false, -76.2f, 0.0f)
                close()
                moveTo(279.7f, 194.2f)
                arcToRelative(38.1f, 38.1f, 0.0f, true, false, 76.2f, 0.0f)
                arcToRelative(38.1f, 38.1f, 0.0f, true, false, -76.2f, 0.0f)
                close()
                moveTo(441.9f, 156.1f)
                arcToRelative(38.1f, 38.1f, 0.0f, true, false, 0.0f, 76.2f)
                arcToRelative(38.1f, 38.1f, 0.0f, true, false, 0.0f, -76.2f)
                close()
                moveTo(156.2f, 317.8f)
                arcToRelative(38.1f, 38.1f, 0.0f, true, false, 76.2f, 0.0f)
                arcToRelative(38.1f, 38.1f, 0.0f, true, false, -76.2f, 0.0f)
                close()
                moveTo(317.8f, 279.7f)
                arcToRelative(38.1f, 38.1f, 0.0f, true, false, 0.0f, 76.2f)
                arcToRelative(38.1f, 38.1f, 0.0f, true, false, 0.0f, -76.2f)
                close()
                moveTo(403.9f, 317.8f)
                arcToRelative(38.1f, 38.1f, 0.0f, true, false, 76.2f, 0.0f)
                arcToRelative(38.1f, 38.1f, 0.0f, true, false, -76.2f, 0.0f)
                close()
                moveTo(70.1f, 403.8f)
                arcToRelative(38.1f, 38.1f, 0.0f, true, false, 0.0f, 76.2f)
                arcToRelative(38.1f, 38.1f, 0.0f, true, false, 0.0f, -76.2f)
                close()
                moveTo(156.2f, 441.9f)
                arcToRelative(38.1f, 38.1f, 0.0f, true, false, 76.2f, 0.0f)
                arcToRelative(38.1f, 38.1f, 0.0f, true, false, -76.2f, 0.0f)
                close()
                moveTo(317.8f, 403.8f)
                arcToRelative(38.1f, 38.1f, 0.0f, true, false, 0.0f, 76.2f)
                arcToRelative(38.1f, 38.1f, 0.0f, true, false, 0.0f, -76.2f)
                close()
                moveTo(403.9f, 441.9f)
                arcToRelative(38.1f, 38.1f, 0.0f, true, false, 76.2f, 0.0f)
                arcToRelative(38.1f, 38.1f, 0.0f, true, false, -76.2f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowUpRightDots!!
    }

private var _arrowUpRightDots: ImageVector? = null
