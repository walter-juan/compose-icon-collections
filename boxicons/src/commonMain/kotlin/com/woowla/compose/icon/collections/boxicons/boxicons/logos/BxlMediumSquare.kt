package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlMediumSquare: ImageVector
    get() {
        if (_bxlMediumSquare != null) {
            return _bxlMediumSquare!!
        }
        _bxlMediumSquare = Builder(name = "BxlMediumSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                lineTo(4.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(21.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(17.954f, 7.265f)
                lineTo(16.988f, 8.19f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, false, -0.106f, 0.271f)
                verticalLineToRelative(6.801f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, false, 0.106f, 0.271f)
                lineToRelative(0.942f, 0.926f)
                verticalLineToRelative(0.204f)
                horizontalLineToRelative(-4.741f)
                verticalLineToRelative(-0.204f)
                lineToRelative(0.977f, -0.948f)
                curveToRelative(0.097f, -0.096f, 0.097f, -0.125f, 0.097f, -0.271f)
                lineTo(14.263f, 9.742f)
                lineToRelative(-2.716f, 6.896f)
                horizontalLineToRelative(-0.368f)
                lineTo(8.018f, 9.742f)
                verticalLineToRelative(4.622f)
                arcToRelative(0.644f, 0.644f, 0.0f, false, false, 0.176f, 0.531f)
                lineToRelative(1.271f, 1.541f)
                verticalLineToRelative(0.203f)
                lineTo(5.861f, 16.639f)
                verticalLineToRelative(-0.203f)
                lineToRelative(1.271f, -1.541f)
                arcToRelative(0.618f, 0.618f, 0.0f, false, false, 0.164f, -0.531f)
                lineTo(7.296f, 9.02f)
                arcToRelative(0.468f, 0.468f, 0.0f, false, false, -0.152f, -0.395f)
                lineToRelative(-1.13f, -1.36f)
                verticalLineToRelative(-0.203f)
                lineTo(9.52f, 7.062f)
                lineToRelative(2.71f, 5.943f)
                lineToRelative(2.382f, -5.943f)
                horizontalLineToRelative(3.343f)
                verticalLineToRelative(0.203f)
                close()
            }
        }
        .build()
        return _bxlMediumSquare!!
    }

private var _bxlMediumSquare: ImageVector? = null
